#include "../../include/devices/sound_card.h"

void SoundCard::readDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(300));
    play();
}

void SoundCard::writeDevice()
{
    std::this_thread::sleep_for(std::chrono::milliseconds(500));
    record();
}
