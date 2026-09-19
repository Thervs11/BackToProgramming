export default function Animals ({animalName, noOfFeet, type}) {
    return (
        <>
            <h2>{animalName}</h2>
            <p>No of feet: {noOfFeet}</p>
            <p>Type: {type}</p>
        </>
    );
}