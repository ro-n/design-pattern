#ifndef NET_CARD_READ_H_BEHQFPBZ
#define NET_CARD_READ_H_BEHQFPBZ

#include "../abstract_read_command.h"
#include "../devices/internet_card.h"

class InternetCardRead : public ReadCommand
{
public:
    InternetCardRead () = default;
    virtual ~InternetCardRead () = default;
    InternetCardRead(InternetCard *nc);
    void readCommand();

private:
    /* data */
    InternetCard *net_card_;
};

#endif /* end of include guard: NET_CARD_READ_H_BEHQFPBZ */
