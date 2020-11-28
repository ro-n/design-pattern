#ifndef SOUND_CARD_H_I8RWHCYY
#define SOUND_CARD_H_I8RWHCYY

#include "../abstract_device.h"

class SoundCard : public Device
{
public:
    SoundCard () = default;
    virtual ~SoundCard () = default;
    void readDevice();
    void writeDevice();

private:
    /* data */

    void play() { std::cout << "sound card playing" << "\n"; }
    void record() { std::cout << "sound card recording" << "\n"; }
};

#endif /* end of include guard: SOUND_CARD_H_I8RWHCYY */
