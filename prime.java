/*                          EXPERIMENT-2

NAME:NIRANJAN MANGESH KHEDKAR
ROLL NO:26
DIV:B

AIM:Write a program to generate prime numbers between 100 to 500
*/
class prime
{
  public static void main(String args[])
     {
       int i,j;
		System.out.println("All the Prime numbers between 100 and 500 are:");
		for(i=100;i<=500;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			
			if(i==j){
				System.out.print(i+" - ");
			}
		}
	}
} 
/*OUTPUT:
 * Prime numbers between 100 and 500 are:
101 - 103 - 107 - 109 - 113 - 127 - 131 - 137 - 139 - 149 - 151 - 157 - 163 - 167 - 173 - 179 - 181 - 191 - 
* 193 - 197 - 199 - 211 - 223 - 227 - 229 - 233 - 239 - 241 - 251 - 257 - 263 - 269 - 271 - 277 - 281 - 283 
* - 293 - 307 - 311 - 313 - 317 - 331 - 337 - 347 - 349 - 353 - 359 - 367 - 373 - 379 - 383 - 389 - 397 - 401
*  - 409 - 419 - 421 - 431 - 433 - 439 - 443 - 449 - 457 - 461 - 463 - 467 - 479 - 487 - 491 - 499 -
*/        
