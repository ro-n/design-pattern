#ifndef RAM_H_I4KDXNZN
#define RAM_H_I4KDXNZN

#include "../abstract_device.h"

class RAM : public Device
{
public:
    RAM () = default;
    virtual ~RAM () = default;
    void readDevice();
    void writeDevice();

private:
    /* data */

    void read() { std::cout << "read from ram" << "\n"; }
    void write() { std::cout << "write to ram" << "\n"; }
};

#endif /* end of include guard: RAM_H_I4KDXNZN */
