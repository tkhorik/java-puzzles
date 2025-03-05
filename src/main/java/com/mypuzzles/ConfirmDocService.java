package com.mypuzzles;

//@Service
public class ConfirmDocService {
//    @Autowired
//    ConfirmDocMapper confirmDocMapper;
//
//    @Autowired
//    ConfirmDocRepository confirmDocRepository;
//
//    @Autowired
//    ConfirmDocStateMachineService confirmDocStateMachineService;
//
//    @Autowired
//    StateMachineFactory<DocStatusState, DocStatusEvent> confirmDocStateMachineFactory;
//
//    @Transactional
//    public ConfirmDocDto createConfirmDoc(ConfirmDocDto confirmDocDto) {
//        ConfirmDoc confirmDoc = confirmDocMapper.toEntity(confirmDocDto);
//        StateMachine<DocStatusState, DocStatusEvent> sm = confirmDocStateMachineFactory.getStateMachine();
//        sm.getExtendedState().getVariables().put("CONFIRM_DOC_TO_BE_SAVED", confirmDoc);
//        sm.start();
//        confirmDoc.setDocStatusId(sm.getState().getId());
//
//        ConfirmDoc savedConfirmDoc = saveOrUpdate(confirmDoc);
//
//        return confirmDocMapper.toDto(savedConfirmDoc);
//    }
//
//    @Transactional
//    public ConfirmDoc saveOrUpdate(ConfirmDoc confirmDoc) {
//        if (confirmDocRepository.findAll().stream().filter(it -> it.id == confirmDoc.id).count() == 1) {
//            ConfirmDoc confirmDocFromDb = confirmDocRepository.findById(confirmDoc.id);
//            ConfirmDoc updConfirmDoc = confirmDocMapper.update(confirmDocFromDb, confirmDoc);
//            return confirmDocRepository.save(confirmDoc);
//        } else {
//            return confirmDocRepository.save(confirmDoc);
//        }
//    }
}
