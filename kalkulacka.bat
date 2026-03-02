@echo off
setlocal EnableDelayedExpansion

:LOOP

set /P num1="Zadej cislo 1: "
set /P operace="Zadej operaci: "
set /P num2="Zadej cislo 2: "

set isValid=false

for %%n in (%*) do (
    if !operace!==%%n (
        set isValid=true
    )
)

if !isValid!==false (
    exit /B 2
)

if !operace!==+ (
    set /A vysledek=num1+num2
)
if !operace!==- (
    set /A vysledek=num1-num2
)
if !operace!==* (
    set /A vysledek=num1*num2
)
if !operace!==/ (
    set /A vysledek=num1/num2
)

if %vysledek%==-1 (
    exit /B 0
)

echo vysledek je %vysledek%

GOTO LOOP