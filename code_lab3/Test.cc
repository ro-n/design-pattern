#include <iostream>
#include <vector>
#include <queue>

#include "include/headers.h"

int main(int argc, char *argv[])
{
    std::vector<Device *> devs;

    std::cout << "mounting devices..." << "\n";
    devs.push_back(new InternetCard());
    devs.push_back(new SoundCard());
    devs.push_back(new RAM());
    devs.push_back(new GPU());
    devs.push_back(new GPU());

    std::queue<Command *> cmds;
    cmds.push(new InternetCardRead((InternetCard *) devs[0]));
    cmds.push(new SoundcardWrite((SoundCard *) devs[1]));
    cmds.push(new RAMWrite((RAM *) devs[2]));
    cmds.push(new RAMRead((RAM *) devs[2]));
    cmds.push(new GPURead((GPU *) devs[3]));
    cmds.push(new GPURead((GPU *) devs[3]));
    cmds.push(new GPUWrite((GPU *) devs[4]));

    Dispatcher::init(&cmds);
    Dispatcher::start();

    std::this_thread::sleep_for(std::chrono::milliseconds(500));

    Dispatcher::stop();

    while (!cmds.empty()) {
        auto& cmd = cmds.front();
        cmds.pop();
        delete cmd;
    }

    std::cout << "unmounting devices..." << "\n";
    for (auto dev : devs) delete dev;

    return 0;
}
