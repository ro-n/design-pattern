cmake_minimum_required(VERSION 3.10)
project(lab3)

set(CMAKE_CXX_STANDARD 17)

include_directories(include)
include_directories(include/devices)
include_directories(include/commands)

file(GLOB SRCES "src/*.cc")
file(GLOB DEVS "src/devices/*.cc")
file(GLOB CMDS "src/commands/*.cc")

add_executable(Test ${SRCES} ${DEVS} ${CMDS} Test.cc)
