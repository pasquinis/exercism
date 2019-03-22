#!/bin/sh

tmux start-server
tmux new-session -d -s exercism -n code
tmux new-window -texercism:1 -n code
tmux split-window -texercism:1 -p 50 -h

tmux send-keys -texercism:1 'cd ~/projects/others/pasquinis/exercism; clear' C-m

tmux select-window -texercism:1
tmux attach-session -d -texercism
