#include "../../include/devices/ram.h"

void RAM::readDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(150));
    read();
}

void RAM::writeDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(500));
    write();
}
