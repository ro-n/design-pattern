#include "../../include/devices/gpu.h"

void GPU::readDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(500));
    readMatrix();
}

void GPU::writeDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(200));
    writeMatrix();
}
