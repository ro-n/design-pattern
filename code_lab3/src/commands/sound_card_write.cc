#include "../../include/commands/sound_card_write.h"

SoundcardWrite::SoundcardWrite(SoundCard *sc) :s_card_(sc) {}

void SoundcardWrite::writeCommand()
{
    s_card_->writeSafe();
}
