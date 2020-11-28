#ifndef DISPATCHER_H_6GY8DVBS
#define DISPATCHER_H_6GY8DVBS

#include <queue>
#include <vector>
#include <thread>

#include "abstract_command.h"

class Dispatcher
{
    static std::queue<Command *> *reqs;
    static std::vector<std::thread *> pools_read;
    static std::vector<std::thread *> pools_write;

public:
    // static Dispatcher& getInstance();
    static void init(std::queue<Command *> *reqs);
    static void start();
    static void stop();

public:
    Dispatcher(Dispatcher const&) = delete;
    void operator=(Dispatcher const&) = delete;

private:
    /* data */

    Dispatcher() = default;
};

#endif /* end of include guard: DISPATCHER_H_6GY8DVBS */

// Ref: https://stackoverflow.com/questions/1008019/c-singleton-design-pattern
