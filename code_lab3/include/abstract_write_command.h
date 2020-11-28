#ifndef ABSTRACT_WRITE_COMMAND_H_SRSQKXP7
#define ABSTRACT_WRITE_COMMAND_H_SRSQKXP7

#include "abstract_command.h"

class WriteCommand : public Command
{
public:
    WriteCommand () = default;
    virtual ~WriteCommand () = default;
    virtual void writeCommand() = 0;
    void execute()
    {
        writeCommand();
    }

private:
    /* data */
};

#endif /* end of include guard: ABSTRACT_WRITE_COMMAND_H_SRSQKXP7 */
