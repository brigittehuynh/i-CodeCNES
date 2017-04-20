#!/bin/sh
cat $1 | sed "s/\t/ /g;s/  / /g;s/^ //;s/\r//g" \
| awk 'BEGIN { FS = " "; StartType = 0; StartEnum = 0; typeName=""; }
		$1 == "typedef" && $2 == "enum"	{ 
			StartType = 1			
			if ( $3 ~ /^[0-9A-Z_][0-9a-zA-Z_]*$/ ) { typeName=$3 }
			if ( $4 ~ /^{$/ ) { StartEnum=1 }
			print $1 " " $2 ":" $3
		}
		$1 ~ /^\/\*$/ { print "commentaire... " $0 }
		$1 ~ /^{$/ { if ( StartType == 1 ) { StartEnum=1 ; print "debut: " $1 } }
		$1 ~ /^}$/ { if ( StartEnum == 1 ) { StartType=0 ; StartEnum=0 ; print "fin: " $1 } }
		{ print "Verif: [" $1 "]" } '
		exit
		$1 ~ /^[0-9A-Z_][0-9a-zA-Z_]*$/ { if (StartEnum == 1) print typeName ":" $1 }
		$1 ~ /^[0-9A-Z_][0-9a-zA-Z_]*,$/ { if (StartEnum == 1) print typeName ":" $1 }
		END { } '
exit

#| awk 'BEGIN { FS = " "; StartType = 0; StartEnum = 0; typeName=""; }
#		$1 == "typedef" && $2 == "enum"	{
#			StartType = 1			
#			if ( $3 ~ /^[0-9A-Z_][0-9a-zA-Z_]*$/ ) { typeName=$3 }
#			if ( $4 ~ /^{$/ ) { StartEnum=1 }
#		}
#		$1 ~ /^{$/ { if ( StartType == 1 ) { StartEnum=1 } }
#		$1 ~ /^}$/ { if ( StartEnum == 1 ) { StartType=0 ; StartEnum=0 } }
#		$1 ~ /^[0-9A-Z_][0-9a-zA-Z_]*$/ { if (StartEnum == 1) print typeName ":" $1 }
#		$1 ~ /^[0-9A-Z_][0-9a-zA-Z_]*,$/ { if (StartEnum == 1) print typeName ":" $1 }
#		END { } '
