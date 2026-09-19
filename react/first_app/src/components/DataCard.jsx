
const DataCard = (content) => {
  return (
    <div> 
        <h2>{content.title}</h2>
        <p>{content.value}</p>
    </div>
  )
}

export default DataCard;