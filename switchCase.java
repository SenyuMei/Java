printf("Menu:\n[s]uma, [m]ulti, [a]caba\n");
			scanf("%c", &op);
			switch (op) {
				case 's':
				case 'S':
					scanf("%f%f%*c", &op1, &op2);
					printf("%f\n", op1 + op2);
					break;
				case 'm':
				case 'M':
					scanf("%f%f%*c", &op1, &op2);
					printf("%f\n", op1 * op2);
					break;
				case 'a':
				case 'A':
					break;
				default:
					printf("Comando erroneo\n");
					scanf("%*c");
			}
	} while (op != 'a' && op != 'A');
}
