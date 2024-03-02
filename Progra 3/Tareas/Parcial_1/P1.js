


    
    
    
    
    
            console.log("\n1. El método push() agrega uno o más elementos al final de un array y devuelve la nueva longitud del array.");
            const frutas = ['apple', 'banana', 'orange'];
            console.log(frutas);
            frutas.push('papaya, mango, sandia');
             
            console.log(frutas);


            console.log("\n2. El método pop() elimina el último elemento de un array y lo devuelve. Este método cambia la longitud del array.");
            const verduras = ['papa', 'aguacate', 'brocoli'];
            console.log(verduras);
            const lastVer = verduras.pop();

            console.log(lastVer);

            console.log("\n3. El método unshift() agrega uno o más elementos al inicio del array, y devuelve la nueva longitud del array.");
            const Minerales = ['oro', 'plata'];
            console.log(Minerales);
            Minerales.unshift('hierro');
            
            console.log(Minerales);

            console.log("\n4. El método shift() elimina el primer elemento del array y lo retorna. Este método cambia la longitud del array.");
            const Mineralesv2 = ['plomo', 'acero', 'platino'];
            console.log(Mineralesv2);
            const firstMineralesv2 = Mineralesv2.shift();
            
            console.log(firstMineralesv2);

            console.log("\n5. El método concat() se utiliza para unir dos o más arrays. Este método no cambia los arrays existentes, sino que devuelve un nuevo array.");
            const minerales1 = ['oro', 'plata','hierro'];
            console.log(minerales1);
            const minerales2 = ['plomo', 'acero', 'platino'];
            console.log(minerales2);
            const allMinerales = minerales1.concat(minerales2);

            console.log(allMinerales);

            console.log("\n6. El método indexOf() devuelve el primer índice en el que se encuentra un elemento dado en el array, o -1 si no está presente.");
            const Mineralesv3 = ['estaño', 'cobre', 'tungsteno', 'aluminio', 'plata'];
            console.log(Mineralesv3);
            const index = Mineralesv3.indexOf('cobre');

            console.log(Mineralesv3[index]);

            console.log("\n7. El método filter() crea un nuevo arreglo con todos los elementos que cumplan una condición especificada por una función");
            const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
            console.log(numeros);
            const evenNumeros = numeros.filter(num => num % 2 === 0);

            console.log(evenNumeros);

            console.log("\n8. El método map() crea un nuevo arreglo con los resultados de llamar a una función proporcionada en cada elemento del arreglo original");
            const numeros1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
            console.log(numeros1);
            const squaredNumeros = numeros1.map(num => num * num);

            console.log(squaredNumeros);

            console.log("\n9. El método reduce() ejecuta una función reductora en cada elemento del arreglo, resultando en un único valor de salida");
            const numeros3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
            console.log(numeros3);
            const sum = numeros3.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
          
            console.log(sum);
           
            console.log("\n10. El método sort() se utiliza para ordenar los elementos de un arreglo. Por defecto, los ordena alfabéticamente");
            const comidaschapinas = ['frijoles', 'tortillas', 'rellenitos', 'tamales', 'chuchitos'];
            console.log(comidaschapinas);
            comidaschapinas.sort();

            console.log(comidaschapinas);
        
