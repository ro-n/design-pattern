#include "../include/dispatcher.h"
#include "../include/abstract_read_command.h"
#include "../include/abstract_write_command.h"

std::queue<Command *> *Dispatcher::reqs;
std::vector<std::thread *> Dispatcher::pools_read;
std::vector<std::thread *> Dispatcher::pools_write;

// Dispatcher& Dispatcher::getInstance()
// {
    // static Dispatcher D;
    // return D;
// }

void Dispatcher::init(std::queue<Command *> *cmds)
{
    reqs = cmds;
}

void Dispatcher::start()
{
    std::cout << "dispatch starting..." << "\n";
    while (!(*reqs).empty()) {
        Command *temp = (*reqs).front();
        if (dynamic_cast<ReadCommand *>(temp)) {
            pools_read.push_back(new std::thread(&Command::execute, &(*temp)));
        } else if (dynamic_cast<WriteCommand *>(temp)) {
            pools_write.push_back(new std::thread(&Command::execute, &(*temp)));
        } else {
            std::cout << "error start" << "\n";
        }
        (*reqs).pop();
    }
}

void Dispatcher::stop()
{
    std::cout << "dispatch stopping..." << "\n";
    for (auto thread : pools_read) {
        thread->join();
    }
    for (auto thread : pools_write) {
        thread->join();
    }
    std::cout << "dispatch stopped" << "\n";
}
