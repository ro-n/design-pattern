#include "../../include/commands/ram_read.h"

RAMRead::RAMRead(RAM *r) :ram_(r) {}

void RAMRead::readCommand()
{
    ram_->readSafe();
}
