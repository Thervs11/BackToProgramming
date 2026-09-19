import { Link } from "react-router-dom";
import students from "../data/students.json";
function Student() {
    return (
        <div>
            {students.map((student) => (
                <div className="student-card" key={student.id}>
                    <h2>{student.name}</h2>
                    <p>Student Number: {student.studentNumber}</p>
                    <p>Course: {student.course}</p>
                    <p>Year: {student.year}</p>
                    <p>Section: {student.section}</p>
                    <Link to={`/students/${student.id}`}>View Details</Link>
                </div>
            ))}
        </div>
    );
}

export default Student;