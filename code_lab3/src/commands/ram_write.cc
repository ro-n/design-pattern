#include "../../include/commands/ram_write.h"

RAMWrite::RAMWrite(RAM *r) :ram_(r) {}

void RAMWrite::writeCommand()
{
    ram_->writeSafe();
}
