#include "../../include/commands/gpu_read.h"

GPURead::GPURead(GPU *g) :gpu_(g) {}

void GPURead::readCommand()
{
    gpu_->readSafe();
}
