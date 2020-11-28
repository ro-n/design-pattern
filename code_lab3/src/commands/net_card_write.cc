#include "../../include/commands/net_card_write.h"

InternetCardWrite::InternetCardWrite(InternetCard *nc) :net_card_(nc) {}

void InternetCardWrite::writeCommand()
{
    net_card_->writeSafe();
}
