#!/usr/bin/env bash

sync
sleep 5s
echo 3 > /proc/sys/vm/drop_caches
sleep 5s
