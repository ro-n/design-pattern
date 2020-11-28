#ifndef GPU_READ_H_JBMEYY4N
#define GPU_READ_H_JBMEYY4N

#include "../devices/gpu.h"
#include "../abstract_read_command.h"

class GPURead : public ReadCommand
{
public:
    GPURead () = default;
    GPURead (GPU *g);
    virtual ~GPURead () = default;
    void readCommand();

private:
    /* data */
    GPU *gpu_;
};

#endif /* end of include guard: GPU_READ_H_JBMEYY4N */
