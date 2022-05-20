#!/bin/bash

set -e
nohup java -cp cmdwithentrypoint-1.0.jar com.cme.beans.PrintNumbers & 
exec $@
