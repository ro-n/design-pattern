#ifndef RAM_READ_H_DOPCX60U
#define RAM_READ_H_DOPCX60U

#include "../devices/ram.h"
#include "../abstract_read_command.h"

class RAMRead : public ReadCommand
{
public:
    RAMRead () = default;
    RAMRead (RAM *r);
    virtual ~RAMRead () = default;
    void readCommand();

private:
    /* data */
    RAM *ram_;
};

#endif /* end of include guard: RAM_READ_H_DOPCX60U */
