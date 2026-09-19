import animals from "./data/animal.json";
import Animals from "./components/Animals";

export default function App() {
    return (
        <>
            <h1>Animal List: </h1>
            {animals.map((animal, index) => {
                return (
                    <Animals
                        key = {index}
                        animalName = {animal.animalName}
                        noOfFeet = {animal.noOfFeet}
                        type = {animal.type}
                    />
                );
            })}
            <hr />
            <h1>Domestic Animals</h1>
            {animals   
                .filter((animal) => {
                    return animal.type === "Domestic";
                })  
                .map((domAnimal, index) => {
                    return (
                        <Animals 
                            key = {index}
                            animalName = {domAnimal.animalName}
                            noOfFeet = {domAnimal.noOfFeet}
                        />
                    );
                })  
            }
            <hr />
            <h1>Exotic Animals</h1>
            {animals
                .filter((animal) => {
                    return animal.type === "Exotic";
                })
                .map((exoAnimal, index) => {
                    return (
                        <Animals 
                            key = {index}
                            animalName = {exoAnimal.animalName}
                            noOfFeet = {exoAnimal.noOfFeet}
                        />
                    );
                })}

           
            
        </>
    );
}   