#ifndef RAM_WRITE_H_TVGHUXIZ
#define RAM_WRITE_H_TVGHUXIZ

#include "../devices/ram.h"
#include "../abstract_write_command.h"

class RAMWrite : public WriteCommand
{
public:
    RAMWrite () = default;
    RAMWrite(RAM *ram_);
    virtual ~RAMWrite () = default;
    void writeCommand();

private:
    /* data */
    RAM *ram_;
};

#endif /* end of include guard: RAM_WRITE_H_TVGHUXIZ */
