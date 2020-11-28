#ifndef ABSTRACT_DEVICE_H_2CQVARF8
#define ABSTRACT_DEVICE_H_2CQVARF8

#include <iostream>
#include <mutex>
#include <shared_mutex>
#include <thread>
#include <chrono>

class Device
{
public:
    Device () = default;
    virtual ~Device () = default;
    void writeSafe()
    {
        std::unique_lock lock(mutex_);
        writeDevice();
    }
    void readSafe()
    {
        std::shared_lock lock(mutex_);
        readDevice();
    }
    virtual void readDevice() = 0;
    virtual void writeDevice() = 0;

private:
    /* data */
    void *local_memory_unit;
    mutable std::shared_mutex mutex_;
};

#endif /* end of include guard: ABSTRACT_DEVICE_H_2CQVARF8 */
