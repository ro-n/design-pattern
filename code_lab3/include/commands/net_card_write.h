#ifndef NET_CARD_WRITE_H_MGC8FPD7
#define NET_CARD_WRITE_H_MGC8FPD7

#include "../devices/internet_card.h"
#include "../abstract_write_command.h"

class InternetCardWrite : public WriteCommand
{
public:
    InternetCardWrite () = default;
    virtual ~InternetCardWrite () = default;
    InternetCardWrite(InternetCard *nc);
    void writeCommand();

private:
    /* data */
    InternetCard *net_card_;
};

#endif /* end of include guard: NET_CARD_WRITE_H_MGC8FPD7 */
