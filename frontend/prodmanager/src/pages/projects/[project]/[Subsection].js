import SubsectionBanner from "@/components/SubsectionBanner"
import { useRouter } from "next/router"

export default function Subsection(props){
    
    return <div>
        <SubsectionBanner id={props.urlParams.Subsection}/>
        <div>Issues</div>
        
    </div>
}
export function getServerSideProps(context){
    const urlParams = context.query;

    return {props : {urlParams}};
}