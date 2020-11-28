#include "../../include/devices/internet_card.h"

void InternetCard::readDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(100));
    sendIn();
}

void InternetCard::writeDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(200));
    recvFrom();
}
