import { Link } from "react-router-dom";

export default function Student({student}) {
    return (
        <div className="student-card">
            <h2>{student.name}</h2>

            <p>Student Number: {student.studentNumber}</p>
            <p>Course: {student.course}</p>
            <p>Year: {student.year}</p>

            <Link to={`/students/${student.id}`}>
                View Details
            </Link> 
        </div>
    );    
}
