@echo off
setlocal EnableDelayedExpansion


if not exist pocet_%1.txt (
    echo 0 > pocet_%1.txt
)
set /P pocet=<pocet_%1.txt

:OTAZKA
set /P inp="Pridat (+) nebo precist (-) "
if %inp%==+ goto ADD
if %inp%==- goto VYPIS

:ADD
set /P jmenoUlohy="Zadej jmeno ulohy: "
set /P datum="Do kdy ma byt splnena: "
echo !jmenoUlohy! !datum! >> tasks_%1.txt
set /A pocet+=1
echo !pocet! > pocet_%1.txt
goto OTAZKA

:VYPIS
echo %1 ma !pocet! uloh:
type tasks_%1.txt
goto OTAZKA