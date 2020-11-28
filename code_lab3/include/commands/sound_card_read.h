#ifndef SOUND_CARD_READ_H_OQ71209P
#define SOUND_CARD_READ_H_OQ71209P

#include "../abstract_read_command.h"
#include "../devices/sound_card.h"

class SoundcardRead : public ReadCommand
{
public:
    SoundcardRead () = default;
    virtual ~SoundcardRead () = default;
    SoundcardRead(SoundCard *sc);
    void readCommand();

private:
    /* data */
    SoundCard *s_card_;
};

#endif /* end of include guard: SOUND_CARD_READ_H_OQ71209P */
