#include "../../include/commands/gpu_write.h"

GPUWrite::GPUWrite(GPU *g) :gpu_(g) {}

void GPUWrite::writeCommand()
{
    gpu_->writeSafe();
}
