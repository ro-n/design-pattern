#ifndef GPU_H_HISTYJ7N
#define GPU_H_HISTYJ7N

#include "../abstract_device.h"

class GPU : public Device
{
public:
    GPU () = default;
    virtual ~GPU () = default;
    void readDevice();
    void writeDevice();

private:
    /* data */
    void readMatrix() { std::cout << "read from gpu" << "\n"; }
    void writeMatrix() { std::cout << "write to gpu" << "\n"; }
};

#endif /* end of include guard: GPU_H_HISTYJ7N */
