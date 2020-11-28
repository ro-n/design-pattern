#ifndef ABSTRACT_COMMAND_H_P5BQCTZV
#define ABSTRACT_COMMAND_H_P5BQCTZV

#include "abstract_device.h"

class Command
{
public:
    Command () = default;
    virtual ~Command () = default;
    virtual void execute() = 0;

protected:
    /* data */
    Device *d;
};

#endif /* end of include guard: ABSTRACT_COMMAND_H_P5BQCTZV */
