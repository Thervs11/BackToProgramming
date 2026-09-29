import { useParams } from "react-router-dom";
import students from "../data/students.json";

export default function StudentDetails() {
    const { id } = useParams();

    const student = students.find(
        (student) => student.id === parseInt(id)
    );

    if (!student) {
        return <h1>Student Not Found.</h1>;
    }

    return (
        <>
            <h1>Student Details</h1>

            <p>Name: {student.name}</p>
            <p>Student Number: {student.studentNumber}</p>
            <p>Course: {student.course}</p>
            <p>Year: {student.year}</p>
        </>
    );
}