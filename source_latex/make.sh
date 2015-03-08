#!/bin/bash
clear
echo '**********************************************************************'
echo '*                                                                    *'
echo '*        SNUC - Smart Network University Communications              *'
echo '*               (GNU General Public Licens - GPL)                    *'
echo '* Mainteiners: Leandro Russo, Daniele Invincibile, Nicola Didomenico *'
echo '*                                                                    *'
echo '**********************************************************************'
echo 'TEMPORARY FILES REMOVED'
rm *.log *.aux *.toc *.out *.snm *.nav
echo 'CLEANING MADE'
pdflatex documentazione.tex
pdflatex documentazione.tex
echo 'CREATED documentazione.pdf'

