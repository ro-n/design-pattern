#include "abstract_command.h"
#include "abstract_read_command.h"
#include "abstract_write_command.h"

#include "dispatcher.h"

#include "devices/gpu.h"
#include "devices/ram.h"
#include "devices/internet_card.h"
#include "devices/sound_card.h"

#include "commands/gpu_read.h"
#include "commands/gpu_write.h"
#include "commands/ram_read.h"
#include "commands/ram_write.h"
#include "commands/net_card_read.h"
#include "commands/net_card_write.h"
#include "commands/sound_card_read.h"
#include "commands/sound_card_write.h"
