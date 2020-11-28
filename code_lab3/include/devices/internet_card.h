#ifndef INTERNET_CARD_H_JALDWXK9
#define INTERNET_CARD_H_JALDWXK9

#include "../abstract_device.h"

class InternetCard : public Device
{
public:
    InternetCard () = default;
    virtual ~InternetCard () = default;
    void readDevice();
    void writeDevice();

private:
    /* data */

    void sendIn() { std::cout << "send in net card" << "\n"; }
    void recvFrom() { std::cout << "recv from net card" << "\n"; }
};

#endif /* end of include guard: INTERNET_CARD_H_JALDWXK9 */
