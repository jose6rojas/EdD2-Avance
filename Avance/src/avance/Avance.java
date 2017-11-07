// martes, 7 de noviembre de 2017
// Avance inicial del proyecto de Estructura de Datos 2
/*
Fernando Isaías Méndez Amador - 11541361
José Carlos Rojas Herrera - 11541234
Oswal René Fuentes Flores - 11611150
*/

package avance;

import java.util.Scanner;

public class Avance {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int op_menu;        
        do {
            
            System.out.print("\nMENÚ PRINCIPAL\n"
                + "1. Archivo\n"
                + "2. Campos\n"
                + "3. Registros\n"
                + "4. Índices\n"
                + "5. Estandarización\n"
                + "6. Salir\n"
                + "Escoja una opción: ");
            
            op_menu = sc.nextInt();
            
            if (op_menu == 1) { // Archivo
                
                int op_archivo;
                do {
                    System.out.print("\nMENÚ ARCHIVO\n"
                        + "1. Nuevo Archivo\n"
                        + "2. Salvar Archivo\n"
                        + "3. Cerrar Archivo\n"
                        + "4. Salir\n"                        
                        + "5. Regresar al Menú Principal\n"
                        + "Escoja una opción: ");
                    
                    op_archivo = sc.nextInt();
                    
                    if (op_archivo == 1) { // Nuevo Archivo                        
                    }
                    else if (op_archivo == 2) { // Salvar Archivo                        
                    }
                    else if (op_archivo == 3) { // Cerrar Archivo                        
                    }
                    else if (op_archivo == 4) { // Salir                        
                    }
                    else if (op_archivo == 5) { } // Regresar al Menú Principal
                    else                    
                        System.out.print("\nDebe escoger una opción válida.\n");                    
                } while (op_archivo != 5);
                
            }
            else if (op_menu == 2) { // Campos
                
                int op_campos;
                do {
                    System.out.print("\nMENÚ CAMPOS\n"
                        + "1. Crear Campos\n"
                        + "2. Listar Campos\n"
                        + "3. Modificar Campos\n"
                        + "4. Borrar Campos\n"
                        + "5. Regresar al Menú Principal\n"
                        + "Escoja una opción: ");
                    
                    op_campos = sc.nextInt();
                    
                    if (op_campos == 1) { // Crear Campos
                    }
                    else if (op_campos == 2) { // Listar Campos
                    }
                    else if (op_campos == 3) { // Modificar Campos
                    }
                    else if (op_campos == 4) { // Borrar Campos
                    }
                    else if (op_campos == 5) { } // Regresar al Menú Principal
                    else
                        System.out.print("\nDebe escoger una opción válida.\n");                                        
                } while (op_campos != 5);
                
            }
            else if (op_menu == 3) { // Registros
                
                int op_registros;
                do {
                    System.out.print("\nMENÚ REGISTROS\n"
                        + "1. Introducir Registros\n"
                        + "2. Modificar Registros\n"
                        + "3. Buscar Registros\n"
                        + "4. Borrar Registros\n"
                        + "5. Listar Registros\n"
                        + "6. Regresar al Menú Principal\n"
                        + "Escoja una opción: ");
                    
                    op_registros = sc.nextInt();
                    
                    if (op_registros == 1) { // Introducir Registros                        
                    }
                    else if (op_registros == 2) { // Modificar Registros
                    }
                    else if (op_registros == 3) { // Buscar Registros
                    }
                    else if (op_registros == 4) { // Borrar Registros
                    }
                    else if (op_registros == 5) { // Listar Registros
                    }
                    else if (op_registros == 6) { } // Regresar al Menú Principal
                    else
                        System.out.print("\nDebe escoger una opción válida.\n");                    
                } while (op_registros != 6);                
                
            }
            else if (op_menu == 4) { // Índices
                
                int op_indices;
                do {
                    System.out.print("\nMENÚ ÍNDICES\n"
                        + "1. Crear Índices\n"
                        + "2. Re-Indexar Archivos\n"
                        + "3. Regresar al Menú Principal\n"
                        + "Escoja una opción: ");
                    
                    op_indices = sc.nextInt();
                    
                    if (op_indices == 1) { // Crear Índices                        
                    }
                    else if (op_indices == 2) { // Re-Indexar Archivos                        
                    }
                    else if (op_indices == 3) { } // Regresar al Menú Principal                    
                    else
                        System.out.print("\nDebe escoger una opción válida.\n");                    
                } while (op_indices != 3);
                
            }
            else if (op_menu == 5) { // Estandarización
                
                int op_estandarizacion;
                do {
                    System.out.print("\nMENÚ ESTANDARIZACIÓN\n"
                        + "1. Exportar Excel\n"
                        + "2. Exportar XML con Schema\n"
                        + "3. Regresar al Menú Principal\n"
                        + "Escoja una opción: ");
                    
                    op_estandarizacion = sc.nextInt();
                    
                    if (op_estandarizacion == 1) { // Exportar Excel
                    }
                    else if (op_estandarizacion == 2) { // Exportar XML con Schema
                    }
                    else if (op_estandarizacion == 3) { } // Regresar al Menú Principal
                    else
                        System.out.print("\nDebe escoger una opción válida.\n");                    
                } while (op_estandarizacion != 3);
                
            }
            else if (op_menu == 6) { } // Salir
            else
                System.out.print("\nDebe escoger una opción válida.\n");            
            
        } while (op_menu != 6);                
        
    }
    
}
