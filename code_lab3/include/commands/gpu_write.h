#ifndef GPU_WRITE_H_YXRJVP4Q
#define GPU_WRITE_H_YXRJVP4Q

#include "../devices/gpu.h"
#include "../abstract_write_command.h"

class GPUWrite : public WriteCommand
{
public:
    GPUWrite () = default;
    virtual ~GPUWrite () = default;
    GPUWrite(GPU *g);
    void writeCommand();

private:
    /* data */
    GPU *gpu_;
};

#endif /* end of include guard: GPU_WRITE_H_YXRJVP4Q */
