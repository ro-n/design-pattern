#include "../../include/commands/sound_card_read.h"

SoundcardRead::SoundcardRead(SoundCard *sc) :s_card_(sc) {}

void SoundcardRead::readCommand()
{
    s_card_->readSafe();
}
