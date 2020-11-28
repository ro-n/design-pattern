#ifndef ABSTRACT_READ_COMMAND_H_5ZXUPKL1
#define ABSTRACT_READ_COMMAND_H_5ZXUPKL1

#include "abstract_command.h"

class ReadCommand : public Command
{
public:
    ReadCommand () = default;
    virtual ~ReadCommand () = default;
    virtual void readCommand() = 0;
    void execute()
    {
        readCommand();
    }

private:
    /* data */
};

#endif /* end of include guard: ABSTRACT_READ_COMMAND_H_5ZXUPKL1 */
