#ifndef SOUND_CARD_WRITE_H_MZWHZ1PU
#define SOUND_CARD_WRITE_H_MZWHZ1PU

#include "../abstract_write_command.h"
#include "../devices/sound_card.h"

class SoundcardWrite : public WriteCommand
{
public:
    SoundcardWrite () = default;
    virtual ~SoundcardWrite () = default;
    SoundcardWrite(SoundCard *sc);
    void writeCommand();

private:
    /* data */
    SoundCard *s_card_;
};

#endif /* end of include guard: SOUND_CARD_WRITE_H_MZWHZ1PU */
