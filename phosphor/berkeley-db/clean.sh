#!/usr/bin/env bash

echo "sync"
sync
sleep 5s
echo "drop caches"
echo 3 > /proc/sys/vm/drop_caches
sleep 5s
echo "done"
