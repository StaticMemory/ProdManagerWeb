import SubsectionParentMenuOption from "./SubsectionParentMenuOption";

export default function SubsectionBanner(context){
    return<div className="text-center text-2xl border-y-2 py-1"> 
        <div className="flex justify-between items-center">
            <SubsectionParentMenuOption/>
            <div className="text-center text-2xl ">{context.id}</div>
            <div></div>
        </div>
    </div>
}