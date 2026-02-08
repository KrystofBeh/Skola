@echo off
setlocal EnableDelayedExpansion

set /A pocet=1

for %%n in (a b c d e f g h) do (
    set /A kelosa=pocet*32

    for /L %%a in (1,1,!kelosa!) do (
        echo %%n >> %%n.txt
    )

    dir %%n.txt >> sizes.txt

    ren %%n.txt !kelosa!x%%n.txt

    set /A pocet+=1
)

