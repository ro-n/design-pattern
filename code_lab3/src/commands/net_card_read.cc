#include "../../include/commands/net_card_read.h"

InternetCardRead::InternetCardRead(InternetCard *nc) :net_card_(nc) {}

void InternetCardRead::readCommand()
{
    net_card_->readSafe();
}
