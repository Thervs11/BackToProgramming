export default function Swimming(props) {
    return (
        <>
            <td>{props.strokeType}</td>
            <td>{props.difficulty}</td>
            <td>{props.howFast}</td>
            <td>{props.comments}</td>
        </>
    );
}